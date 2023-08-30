public class Queue {

    class Queue_array{
        private int maxSize;
        private Object[] queueArray;
        private int front;
        private int rear;
        private int nItems;

        public void enqueue(Object element){
            this.front = (this.front + 1) % this.maxSize;
            this.queueArray[this.front] = element;
            this.nItems++;
        }
        public Object dequeue(){
            Object toReturn = this.queueArray[this.rear];
            this.queueArray[this.rear] = null;
            this.rear = (this.rear + 1) % this.maxSize;
            this.nItems--;
            return toReturn;
        }
    }

    class Queue_Linkedlist{
        private ListasEnlazadas.DoubleEndedList list;

        public void enqueue(Object element){
            this.list.insertLast(element);
        }
        public Object dequeue(){
            return this.list.removeFirst();
        }
    }
}
