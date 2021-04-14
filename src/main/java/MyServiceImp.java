public class MyServiceImp implements MyService {

    private MyDatabase myDatabase;

//    public MyServiceImp(MyDatabase myDatabase) {
//        this.myDatabase = myDatabase;
//    }

    @Override
    public void method() {
        System.out.println(myDatabase.getUrl());
        System.out.println(myDatabase.getPassword());
    }
}
