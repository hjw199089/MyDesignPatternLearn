package SheJiMoShiNaDianShi.State;

/**
 * Created by hjw on 16/9/16.
 *
 * 状态接口
 */
public interface IState {


    /**
     * 状态转换
     *
     * @param context
     * @param mode
     */

    public void convertState(Context context,int mode);


    /**
     * 保存方法
     *
     * @param context
     */
    public void save(Context context);


    /**
     * 修改方法
     *
     * @param context
     */
    public void modify(Context context);


    /**
     * 新增方法
     *
     * @param context
     */
    public void add(Context context);


    /**
     *
     *  查看方法
     *
     * @param context
     */

    public void view (Context context);


}
