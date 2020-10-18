import sun.misc.Queue;

public class QuanLy {
    public static void main(String[] args) throws InterruptedException {
        Queue<NhanVien> congNhan = new Queue<>();
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                NhanVien cn = new NhanVien("qwe",10+i,1+i,1990+i,false);
                congNhan.enqueue(cn);
            }else {
                NhanVien cn = new NhanVien("qwe",0+i,4+i,1985+i,true);
                congNhan.enqueue(cn);
            }
        }
        System.out.println("befor demerging");
        displayQueue(congNhan);
        Queue<NhanVien> nu = new Queue<>();
        Queue<NhanVien> nam = new Queue<>();

        while (!congNhan.isEmpty()){
            NhanVien temp = congNhan.dequeue();
            if(!temp.isMale()){
                nu.enqueue(temp);
            }else {
                nam.enqueue(temp);
            }
        }

        while (!nu.isEmpty()){
            congNhan.enqueue(nu.dequeue());
        }
        while (!nam.isEmpty()){
            congNhan.enqueue(nam.dequeue());
        }
        System.out.println("after demerging");
        displayQueue(congNhan);

    }
    public static void displayQueue(Queue<NhanVien> myQ) throws InterruptedException {
        Queue<NhanVien> newQ = new Queue<>();
        while (!myQ.isEmpty()){
            NhanVien temp = myQ.dequeue();
            System.out.println(temp.getName()+" isMale: "+temp.isMale());
            newQ.enqueue(temp);
        }
        while (!newQ.isEmpty()){
            myQ.enqueue(newQ.dequeue());
        }
    }
}
