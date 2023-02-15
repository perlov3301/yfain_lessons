package insetstest;
import java.awt.Component; 
import java.awt.Dimension; 
import java.awt.FlowLayout; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.awt.Insets; 
import java.awt.Window; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.PrintStream; 
import java.lang.reflect.InvocationTargetException; 
 
import javax.swing.JButton; 
import javax.swing.JCheckBox; 
import javax.swing.JDialog; 
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import javax.swing.JTextArea; 
import javax.swing.SwingUtilities; 
 
//import org.apache.commons.io.output.ByteArrayOutputStream; 
//import org.apache.commons.lang.StringUtils; 

public class UIUtils {

	 
	 public static enum DialogResult { 
	  YES, 
	  NO, 
	  CANCEL; 
	 } 
	  
	 public static void invokeAndWait(Runnable r) { 
	  if ( SwingUtilities.isEventDispatchThread() ) { 
	   r.run(); 
	  } else { 
	   try { 
	    SwingUtilities.invokeAndWait( r ); 
	   } catch (InvocationTargetException e) { 
	    throw new RuntimeException(e.getCause()); 
	   } catch (InterruptedException e) { 
	    Thread.currentThread().interrupt(); 
	   } 
	  } 
	 } 
	  
	 public static void invokeLater(Runnable r) { 
	  if ( SwingUtilities.isEventDispatchThread() ) { 
	   r.run(); 
	  } else { 
	   SwingUtilities.invokeLater( r ); 
	  } 
	 }  
	  
	 public static DialogResult showConfirmationDialog(Component parent, String title,String message) { 
	 
	  final Object[] options = {"Yes","No","Cancel"}; 
	  final int outcome = JOptionPane.showOptionDialog(parent,message, 
	      title, 
	      JOptionPane.YES_NO_CANCEL_OPTION, 
	      JOptionPane.QUESTION_MESSAGE, 
	      null, 
	      options, 
	      options[2]); 
	  switch( outcome ) { 
	  case 0: 
	   return DialogResult.YES; 
	  case 1: 
	   return DialogResult.NO; 
	  case 2: 
	  case JOptionPane.CLOSED_OPTION: 
	   return DialogResult.CANCEL; 
	  default: 
	   throw new RuntimeException("Internal error, unexpected outcome "+outcome); 
	  } 
	 } 
	  
	 /**
	  *  
	  * @param parent 
	  * @param title 
	  * @param message 
	  * @return <code>true</code> if project should also be physically deleted, 
	  * <code>false</code> is project should be deleted but all files should be left alone, 
	  * <code>null</code> if user cancelled the dialog/project should not be deleted 
	  */ 
	
	  
	 public static JDialog createMessageDialog(Window parent,String title,String msg) { 
	 
	  final JDialog dialog = new JDialog( parent , title ); 
	   
	  final JTextArea message = createMultiLineLabel( msg ); 
	 
	  final JPanel buttonPanel = new JPanel(); 
	  buttonPanel.setLayout( new FlowLayout() ); 
	   
	  final JPanel messagePanel = new JPanel(); 
	  messagePanel.setLayout( new GridBagLayout() ); 
	   
	  GridBagConstraints cnstrs = constraints(0,0,true,false, GridBagConstraints.NONE ); 
	  cnstrs.gridwidth = GridBagConstraints.REMAINDER; 
	  cnstrs.weighty=0; 
	  cnstrs.gridheight = 1; 
	  messagePanel.add( message , cnstrs ); 
	   
	  final JPanel panel = new JPanel(); 
	  panel.setLayout( new GridBagLayout() ); 
	   
	  cnstrs = constraints(0,0,true,false , GridBagConstraints.NONE );  
	  cnstrs.gridwidth = GridBagConstraints.REMAINDER; 
	  cnstrs.gridheight = 1; 
	  cnstrs.weighty=0; 
	        cnstrs.insets = new Insets(5,2,5,2); // top,left,bottom,right    
	  panel.add( messagePanel , cnstrs ); 
	   
	  cnstrs = constraints(0,1,true,true, GridBagConstraints.HORIZONTAL );  
	  cnstrs.gridwidth = GridBagConstraints.REMAINDER; 
	  cnstrs.gridheight = 1; 
	  cnstrs.weighty=0; 
	        cnstrs.insets = new Insets(0,2,10,2); // top,left,bottom,right   
	  panel.add( buttonPanel , cnstrs ); 
	   
	  dialog.getContentPane().add( panel ); 
	  dialog.pack(); 
	  return dialog; 
	 } 
	  
	 public static String showInputDialog(Component parent,String title,String message) { 
	  Object[] possibilities = null; 
	  String s = (String) JOptionPane.showInputDialog( 
	                      parent, 
	                      message, 
	                      title, 
	                      JOptionPane.PLAIN_MESSAGE, 
	                      null, 
	                      possibilities, 
	                      null); 
	  if(s == "" | s == " " | s == "  ") { s=null;}
	  return s; 
	 } 
	  
	 public static void showErrorDialog(Component parent,String title,String message) { 
	     showErrorDialog(parent, title, message,null); 
	 } 
	  
	 public static void showErrorDialog(Component parent,String title,String textMessage,Throwable cause)  
	 { 
	     final String stacktrace; 
	     if ( cause == null ) { 
	         stacktrace = null; 
	     } else { 
	         final java.io.ByteArrayOutputStream stackTrace = new java.io.ByteArrayOutputStream(); 
	            cause.printStackTrace( new PrintStream( stackTrace ) ); 
	            stacktrace = new String(stackTrace.toByteArray()); 
	     } 
	      
	        final JDialog dialog = new JDialog( (Window) null, title ); 
	         
	        dialog.setModal( true ); 
	         
	        final JTextArea message = createMultiLineLabel( textMessage ); 
	        final DialogResult[] outcome = { DialogResult.CANCEL }; 
	         
	        final JButton okButton = new JButton("Ok"); 
	        okButton.addActionListener( new ActionListener() { 
	            @Override 
	            public void actionPerformed(ActionEvent e) { 
	                outcome[0] = DialogResult.YES; 
	                dialog.dispose(); 
	            } 
	        }); 
	         
	        final JPanel buttonPanel = new JPanel(); 
	        buttonPanel.setLayout( new FlowLayout() ); 
	        buttonPanel.add( okButton ); 
	         
	        final JPanel messagePanel = new JPanel(); 
	        messagePanel.setLayout( new GridBagLayout() ); 
	         
	        GridBagConstraints cnstrs = constraints(0,0,true,true, GridBagConstraints.BOTH ); 
	        cnstrs.weightx=1; 
	        cnstrs.weighty=0.1; 
	        cnstrs.gridheight = 1; 
	        messagePanel.add( message , cnstrs ); 
	         
	        if ( stacktrace != null  )  
	        { 
	            final JTextArea createMultiLineLabel = new JTextArea( stacktrace ); 
	 
	            createMultiLineLabel.setBackground(null); 
	            createMultiLineLabel.setEditable(false); 
	            createMultiLineLabel.setBorder(null); 
	            createMultiLineLabel.setLineWrap(false); 
	            createMultiLineLabel.setWrapStyleWord(false); 
	             
	            final JScrollPane pane = new JScrollPane( createMultiLineLabel ,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED ); 
	             
	            cnstrs = constraints(0,1,true,true, GridBagConstraints.BOTH );      
	            cnstrs.weightx=1.0; 
	            cnstrs.weighty=0.9; 
	            cnstrs.gridwidth = GridBagConstraints.REMAINDER; 
	            cnstrs.gridheight = GridBagConstraints.REMAINDER; 
	            messagePanel.add( pane , cnstrs ); 
	        } 
	         
	        final JPanel panel = new JPanel(); 
	        panel.setLayout( new GridBagLayout() ); 
	         
	        cnstrs = constraints(0,0,true,false , GridBagConstraints.BOTH );     
	        cnstrs.gridwidth = GridBagConstraints.REMAINDER; 
	        cnstrs.gridheight = 1; 
	        cnstrs.weighty=1.0; 
	        cnstrs.insets = new Insets(5,2,5,2); // top,left,bottom,right            
	        panel.add( messagePanel , cnstrs ); 
	         
	        cnstrs = constraints(0,1,true,true, GridBagConstraints.HORIZONTAL );     
	        cnstrs.gridwidth = GridBagConstraints.REMAINDER; 
	        cnstrs.gridheight = 1; 
	        cnstrs.weighty=0; 
	        cnstrs.insets = new Insets(0,2,10,2); // top,left,bottom,right       
	        panel.add( buttonPanel , cnstrs ); 
	         
	        dialog.getContentPane().add( panel ); 
	         
	        dialog.setMinimumSize(new Dimension(600,400)); 
	        dialog.setPreferredSize(new Dimension(600,400)); 
	        dialog.setMaximumSize(new Dimension(600,400)); 
	         
	        dialog.pack(); 
	        dialog.setVisible( true ); 
	 } 
	 
	    protected static final GridBagConstraints constraints(int x,int y,boolean remainderHoriz,boolean remainderVert,int fill) { 
	        final GridBagConstraints cnstrs = new GridBagConstraints(); 
	        cnstrs.anchor = GridBagConstraints.NORTHWEST; 
	        cnstrs.weightx=1.0d; 
	        cnstrs.weighty =1.0d; 
	        cnstrs.fill = fill; 
	        cnstrs.gridheight = remainderVert ? GridBagConstraints.REMAINDER : 1; 
	        cnstrs.gridwidth = remainderHoriz ? GridBagConstraints.REMAINDER : 1; 
	        cnstrs.gridx=x; 
	        cnstrs.gridy=y; 
	        cnstrs.insets = new Insets(10,2,10,2); // top,left,bottom,right 
	        return cnstrs; 
	    } 
	     
	    public static JTextArea createMultiLineLabel(String text) { 
	     return new TextNote( text ); 
	    } 
	     
	    public static final class TextNote extends JTextArea  
	    { 
	        public TextNote(String text) { 
	            super(text); 
	            setColumns( text.length() ); 
	            setBackground(null); 
	            setEditable(false); 
	            setBorder(null); 
	            setLineWrap(true); 
	            setWrapStyleWord(true); 
	            setFocusable(false); 
	        } 
	    } 
}
