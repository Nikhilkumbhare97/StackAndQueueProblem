import com.bridgelabz.stackandqueue.INode;
import com.bridgelabz.stackandqueue.MyNode;
import com.bridgelabz.stackandqueue.MyQueue;
import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void given3Number_WhenAddedToQueue_ShouldHaveFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        INode peak;
        peak = myQueue.peak();
        Assert.assertEquals(myFirstNode, peak);
    }

    @Test
    public void given3Number_WhenAddedToQueue_ShouldDequeueTheNodes() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        INode peak;
        peak = myQueue.peak();
        Assert.assertNull(peak);

    }
}
