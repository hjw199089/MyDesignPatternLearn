package SheJiMoShiNaDianShi.State;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by hjw on 16/9/16.
 */
public class EditState implements IState {

    /**
     * 状态转换
     *
     */

    @Override
    public void convertState(Context context, int mode) {
        if (mode == Context.PREVIEW_MODE){
            context.changeState(new PreviewState());
        }
    }

    @Override
    public void save(Context context) {
        System.out.println("编辑模式[保存]....");
    }

    @Override
    public void modify(Context context) {
        System.out.println("编辑模式[修改]....");
    }

    @Override
    public void add(Context context) {
        System.out.println("编辑模式[新增]....");
    }

    @Override
    public void view(Context context) {
        System.out.println("编辑模式[查看]....");
    }
}
