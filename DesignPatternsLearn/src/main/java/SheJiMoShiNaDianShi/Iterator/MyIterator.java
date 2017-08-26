package SheJiMoShiNaDianShi.Iterator;

/**
 * Created by hjw on 16/9/14.
 */
public interface MyIterator {

    //判断是否含有下一个节点
    public boolean hasNext();

    //获得下一个节点对象
    public  Object next();

    //删除对象
    public Object remove();


}
