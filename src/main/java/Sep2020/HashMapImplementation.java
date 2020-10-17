package Sep2020;

import java.util.ArrayList;
import java.util.List;

public class HashMapImplementation {
	private ArrayList<KeyValue>[] _storage;
	class KeyValue {
		private String key;
		private Object value;
		
		public KeyValue(String key,Object value) {
			this.key = key;
			this.value = value;
		}
		
	}

	public HashMapImplementation() {
		this._storage = new ArrayList[16];
		
	}
	private int hashCode(String key) {
		
		int finalHash = 0;
		char[] strArray = key.toCharArray();
		
		for(int i=0;i<strArray.length;i++) {
			
		   int codePoint = Character.codePointAt(strArray, i);
		   finalHash+=codePoint;
		}
		return finalHash;
	}
	
	public void set(String key,String value) {
		int idx = this.hashCode(key)%16;
		KeyValue kv = new KeyValue(key, value);
		if(this._storage[idx]==null) {
			this._storage[idx] = new ArrayList<KeyValue>();
		}
		this._storage[idx].add(kv);
	}
	
	public Object get(String key) {
		int idx = this.hashCode(key)%16;
		if(this._storage[idx]!=null) {
		    for (KeyValue entry : this._storage[idx]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bindaa");
		HashMapImplementation hm = new HashMapImplementation();
		hm.set("Bindaaa","Aks");
		hm.set("AAja Gufaaon me Aa","Colonel");
		Object ob = hm.get("Bindaaa");
		System.out.println(ob);
		 ob = hm.get("AAja Gufaaon me Aa");
		System.out.println(ob);		
	}

}
