package java.main.com.patterns.singleton;

class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){

    }

    synchronized public static SingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonThreadSafe();
            System.out.println("1. Instance created");
        }else if (instance != null){
            System.out.println("2. already instance was created");
        }
        return instance;
    }
}

class MainSingletonThreadSafe{
    public static void main(String[] args) {
        SingletonThreadSafe.getInstance();
        SingletonThreadSafe.getInstance();
    }
}
