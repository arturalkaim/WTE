package wte;

import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework;
import wte.domain.WereToEat;


public class PhoneBookApplication {

    public static void main(String[] args) {
    	FenixFramework.initialize(new Config() {{
    		domainModelPath="src/main/dml/weretoeat.dml";
            dbAlias = "//localhost:3306/wtedb";
            dbUsername = "hello";
            dbPassword = "world";
            rootClass=WereToEat.class;
    	}});

    	System.out.println("Welcome to the PhoneBook application!");

    	boolean committed = false;

    	try {
    		//Transaction.begin();
    		//Transaction.commit();
    		committed = true;
    	} finally {
//    		if (!committed)
//    			Transaction.abort();
    	}
    }
}
