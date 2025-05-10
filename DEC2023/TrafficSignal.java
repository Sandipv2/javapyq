class Traffic extends Thread {
    String[] colors = {"RED","YELLOW","GREEN"};
    int[] times = {5000, 3000, 5000};

    public void run() {
        for(int i = 0; i < colors.length; i++) {
            try {
                System.out.println(colors[i]);
                Thread.sleep(times[i]);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class TrafficSignal {
    public static void main(String[] args) {
        Traffic tr = new Traffic();
        tr.start();
    }
}
