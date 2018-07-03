package nullguo.dubboprovider;

public class HelloWorldImpl implements HelloWorld{
	 public Name hello(String name) {
		    Name n=new Name();
	        n.name = name + "nullguo!!";
	        return n;

	    }
}
