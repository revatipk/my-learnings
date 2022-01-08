package Iterator;

public class NameList implements Container{
    public String name[]={"Aryan","Ridhi","Raghav","Adithi","Rocky"};
    @Override
    public Iterator getIterator() {
        return new NameListIterator();
    }

    private class NameListIterator implements Iterator{
        int i=0;
        @Override
        public boolean hasNext() {
            if(i>name.length-1)
                return false;
            else
                return true;

        }

        @Override
        public Object next() {
            if(this.hasNext())
                return name[i++];
            return null;
        }
    }
}
