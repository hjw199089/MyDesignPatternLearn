package SheJiMoShiNaDianShi.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hjw on 16/9/14.
 */
public interface IPersonList {

    /**
     * 获取人员信息内容
     *
     * @return
     */

    public ArrayList<IPerson>  getPersonList();

    /**
     *
     * 获取迭代器
     *
     * @return
     */
    public MyIterator iterator();


}
