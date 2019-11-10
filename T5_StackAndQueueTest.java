
public class T5_StackAndQueueTest {
    public static void main(String[] args) {
        T5_StackAndQueue testQueue = new T5_StackAndQueue();
        System.out.print("\ntestQueue.in():\n");
        for (int i =0; i<=5;i++){
            System.out.print( i + "\t"); 
            testQueue.push(i);
        }
        System.out.print("\ntestQueue.out(): \n" );
        for (int i =0; i<=5;i++){ 
           System.out.print(testQueue.pop() + "\t"); 
        }

            
            
    }
}
