package lesson08;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class FileDownload {//from remote Computer

	public static void main(String args[]) {
    // americhka.us -> download
    // http://myflex.org/yf/podru/budam421.mp3
	// URL->URLConnection->InputStream->read()->data
	// FileOutputStream->write(data)
		if (args.length!=2) {
	System.out.println("Proper Usage: java FileDownload"+
	   " URLofMP3 OutputFileName.mp3");
			System.exit(0);
		}
	
   InputStream in = null;
   FileOutputStream fOut = null;
   System.out.println("FileDownload;args[0]="+args[0]);
   try {
	   URL remoteFile= new URL(args[0]);
	   System.out.println("FileDownload;URL="+remoteFile);
	   URLConnection fileStream = remoteFile.openConnection();
	   // Open output and input streams
	   fOut = new FileOutputStream(args[1]);
	   in = fileStream.getInputStream();
	   // save the file
	   int data;
	   while((data=in.read())!=-1) {
		   fOut.write(data);
	   } 
   } catch(Exception e) {
	   e.printStackTrace();
   } finally {
	   System.out.println("the File "+args[0]+
		" has been download successfully as "+args[1]);
	   try {
		   in.close();
		   fOut.flush();
		   fOut.close();
	   } catch(Exception e) { e.printStackTrace();
	   }
	 }
   
   }// void main
   
	   /**https://youtube.com/watch?v=961_sjY68e0 360ps
	    * 1012 byte:
	    https://rr1---sn-5hneknee.googlevideo.com/videoplayback?expire=1681858227&ei=U8o-ZK2BJ9HE1gLNxKWIDQ&ip=141.193.20.28&id=o-AKNdl8aAoFaw44TILOlmqk26a-HHW7wGOwFHYrX9fwyk&itag=18&source=youtube&requiressl=yes&spc=99c5CWSqxt3Xa3EOpsE-P7vFymwE7GEG8wBiCX4vQw&vprv=1&mime=video%2Fmp4&ns=880AmVRz5I6osYeaR7n7GC0M&gir=yes&clen=1653707&ratebypass=yes&dur=44.419&lmt=1681832120974661&fexp=24007246&c=WEB&txp=5438434&n=zcVRNc3AtuSftw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgUgCbwqBrAsXR9FUdjGUQIKngA5KnGvJqdPV9dderi1cCIF0Porjf7jB2mhf9XQ3HNTKVrqTxtuUnMtulStQa31hd&rm=sn-5hnesl7e&req_id=369cec056257a3ee&cm2rm=sn-cx1x9-ua8d7s,sn-ua8e7l&ipbypass=yes&redirect_counter=3&cms_redirect=yes&cmsv=e&mh=1t&mip=109.64.68.152&mm=34&mn=sn-5hneknee&ms=ltu&mt=1681836278&mv=m&mvi=1&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgDcos6mbf2dBw4wpBPkXF-FU_W0tQMs-SSYqMj2nVPcUCIC9W1xtDG71Cvqxf9GSVUEAGmEUt2OrnvKwtmPFo6AL1
	    https://rr1---sn-5hneknee.googlevideo.com/videoplayback?expire=1681858227&ei=U8o-ZK2BJ9HE1gLNxKWIDQ&ip=141.193.20.28&id=o-AKNdl8aAoFaw44TILOlmqk26a-HHW7wGOwFHYrX9fwyk&itag=18&source=youtube&requiressl=yes&spc=99c5CWSqxt3Xa3EOpsE-P7vFymwE7GEG8wBiCX4vQw&vprv=1&mime=video%2Fmp4&ns=880AmVRz5I6osYeaR7n7GC0M&gir=yes&clen=1653707&ratebypass=yes&dur=44.419&lmt=1681832120974661&fexp=24007246&c=WEB&txp=5438434&n=zcVRNc3AtuSftw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgUgCbwqBrAsXR9FUdjGUQIKngA5KnGvJqdPV9dderi1cCIF0Porjf7jB2mhf9XQ3HNTKVrqTxtuUnMtulStQa31hd&rm=sn-5hnesl7e&req_id=369cec056257a3ee&cm2rm=sn-cx1x9-ua8d7s,sn-ua8e7l&ipbypass=yes&redirect_counter=3&cms_redirect=yes&cmsv=e&mh=1t&mip=109.64.68.152&mm=34&mn=sn-5hneknee&ms=ltu&mt=1681836278&mv=m&mvi=1&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgDcos6mbf2dBw4wpBPkXF-FU_W0tQMs-SSYqMj2nVPcUCIC9W1xtDG71Cvqxf9GSVUEAGmEUt2OrnvKwtmPFo6AL1
	    
	    360p swiss
	    https://rr2---sn-5hnekn7z.googlevideo.com/videoplayback?expire=1682074696&ei=6BdCZNDfGY2s7QTFg4SgCw&ip=90.189.149.42&id=o-AGxADjmaON9f0XN4yPle5LoQ6c_vwgrfCjy0y3Vg-nw6&itag=18&source=youtube&requiressl=yes&spc=99c5CavqsPt4Zpk3-2oM9aRAC-D7D1qJMabM1tfNpA&vprv=1&mime=video%2Fmp4&ns=pga9oXDVw2Qdj7e86s9kuGYM&cnr=14&ratebypass=yes&dur=11599.412&lmt=1658353823346901&fexp=24007246&c=WEB&txp=6318224&n=m9ezc2JoU63m_A&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAIbZY1kL845Tp9vatMZTcVMwGGbv478SqLbMG1XOskAkAiEAofsCEPlfsoFJvV_TalGWcIjSBcMQrJVDTNZivFtkXCU%3D&rm=sn-gvnuxaxjvh-v8cs7k&req_id=250d742e0ca6a3ee&redirect_counter=2&cm2rm=sn-n8vd67k&cms_redirect=yes&cmsv=e&mh=-U&mip=79.183.173.158&mm=34&mn=sn-5hnekn7z&ms=ltu&mt=1682052615&mv=u&mvi=2&pl=13&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAOqzTHhqdY-rG0a0fi4BVfMpTWW4fx8p6i6shDnbGFupAiEA7qBjrJT7VEmDmJI-qY00McZ2QIX1sZnmzv_LrDGDmHo%3D
	    */
  }  

