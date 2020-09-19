package StillJavaThngs;

abstract class Subjects {
    abstract void Schedule();

    abstract String teacher();

    abstract String lessons();
}

interface Criteria {
    boolean canBeFailed();
    boolean isMajor();
    boolean isMinor();
    boolean eligibleRepitition();
}


class Math extends Subjects implements Criteria {
    void Schedule() {
        System.out.println("Start at 10AM");
    }

    String teacher() {
        return "Joe";
    }

    String lessons() {
        return "Cartesian Plane";
    }

    public boolean canBeFailed() {
        return true;
    }

    public boolean isMajor() {
        return true;
    }

    public boolean isMinor() {
        return false;
    }

    public boolean eligibleRepitition() {
        return true;
    }


  
}

class PE extends Subjects implements Criteria {
    void Schedule() {
        System.out.println("Start at 12PM");

    }

    String teacher() {
        return "Ruby";
    }

    String lessons() {
        return "Biology";
    }

    public boolean canBeFailed() {
        return true;
    }

    public boolean isMajor() {
        return false;
    }

    public boolean isMinor() {
        return true;
    }

    public boolean eligibleRepitition() {
        return true;
    }

   
}
