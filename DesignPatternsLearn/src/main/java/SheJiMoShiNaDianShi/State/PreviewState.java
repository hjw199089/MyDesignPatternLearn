package SheJiMoShiNaDianShi.State;

/**
 * Created by hjw on 16/9/16.
 */
public class PreviewState implements  IState{


    /**
     * 状态转换
     *
     * @param context
     * @param mode
     */
    @Override
    public void convertState(Context context, int mode) {
        if (mode == Context.EDIT_MODE){
            context.changeState(new EditState());
        }
    }

    @Override
    public void save(Context context) {
        System.out.println("预览模式[保存]....");
    }

    @Override
    public void modify(Context context) {
        System.out.println("预览模式[修改]....");
    }

    @Override
    public void add(Context context) {
        System.out.println("预览模式[新增]....");
    }

    @Override
    public void view(Context context) {
        System.out.println("预览模式[查看]....");
    }
}
