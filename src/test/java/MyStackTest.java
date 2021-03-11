import com.bridgelabz.stackandqueue.INode;
import com.bridgelabz.stackandqueue.MyNode;
import com.bridgelabz.stackandqueue.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void given3Number_WhenAddedToStack_ShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        
        INode peak;
        peak = myStack.peak();
        Assert.assertEquals(myThirdNode, peak);

    }
}
