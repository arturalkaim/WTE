package wte;

import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework;
import wte.domain.WereToEat;

public class SetupDomain {

    public static void main(String[] args) {
    	FenixFramework.initialize(new Config() {{
    		domainModelPath="src/main/dml/weretoeat.dml";
            dbAlias = "//localhost:3306/wtedb";
            dbUsername = "hello";
            dbPassword = "world";
            rootClass=WereToEat.class;
    	}});
    	
    	populateDomain();
    }

    public static void populateDomain() {

    }
}
