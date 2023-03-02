package lesson07;

public class ShippingOrder<K, V> {
	/**
	 @param K Order ID goes here
	 @param V box with stuff here
	 */
	private K key;
	private V value;
  ShippingOrder(K key, V value) {
	  this.key = key;
	  this.value = value;
	  
  }
  String getOrder() {
	  return "Order  " + key +
			  " contens " + value.toString();
  }
}
