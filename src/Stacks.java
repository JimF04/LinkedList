public class Stacks {

    class Stack_Arrays {
        private int maxSize;
        private Object[] stackArray;
        private int top;

        public void push(Object newObject) throws Exception {
            if (top < maxSize) {
                this.stackArray[++top] = newObject;
            } else {
                throw new Exception("Stack is full");
            }
        }
        public Object pop(){
            return this.stackArray[top--];
        }
        public Object peek(){
            return this.stackArray[top];
        }
    }

    class Stack_LinkedList {
        private ListasEnlazadas.Linkedlist stackList;

        public void push(Object newElement){
            this.stackList.insertFirst(newElement);
        }
        public Object pop(){
            return this.stackList.deleteFirst();
        }
        public Object peek(){
            return this.stackList.getHead();
        }
    }
}
