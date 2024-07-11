enum Status {
    Running, Failed, Pending, Success
}

public class AboutEnum {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        // .....

        Status[] ss = Status.values();

        for (Status it : ss) {
            System.out.println(it);
        }

        // .....

        Status s1 = Status.Pending;

        switch (s1) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("try again");
                break;
            case Pending:
                System.out.println("wait");
                break;
            case Success:
                System.out.println("done");
                break;
        }

    }
}
