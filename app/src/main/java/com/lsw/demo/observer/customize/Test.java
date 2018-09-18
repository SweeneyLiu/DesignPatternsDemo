package com.lsw.demo.observer.customize;

public class Test {
    public static void testObserver(){
        Observable<Weather> observable=new Observable<Weather>();
        Observer<Weather> observer1=new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者1："+data.toString());
            }
        };
        Observer<Weather> observer2=new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者2："+data.toString());
            }
        };

        observable.register(observer1);
        observable.register(observer2);

        //观察者1：Weather{description=’晴转多云’}
        //观察者2：Weather{description=’晴转多云’}
        Weather weather = new Weather("晴转多云");
        observable.notifyObservers(weather);
        //观察者1：Weather{description=’多云转阴’}
        //观察者2：Weather{description=’多云转阴’}
        Weather weather1 = new Weather("多云转阴");
        observable.notifyObservers(weather1);

        observable.unregister(observer1);
        //观察者2：Weather{description=’台风’}
        Weather weather2 = new Weather("台风");
        observable.notifyObservers(weather2);

    }
}
