package SheJiMoShiNaDianShi.ProtoType_DeepLightCopy;

import java.util.ArrayList;

/**
 * Created by hjw on 16/8/31.
 */
public class LightCopyTest implements  Cloneable{

    private ArrayList<String> arrayList = new ArrayList<String>();

    public void add(String s){
         arrayList.add(s);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public LightCopyTest clone(){
        try{
            return (LightCopyTest) super.clone();
        }catch (CloneNotSupportedException e){

        }
        return null;
    }

    public static void main(String[] args) {
        LightCopyTest deepLightCopyTest = new LightCopyTest();

        deepLightCopyTest.add("aa");
        deepLightCopyTest.add("bb");

        System.out.println("deepLightCopyTest:"+"[" + deepLightCopyTest.getArrayList() + "]");

        LightCopyTest deepLightCopyTest2 = deepLightCopyTest.clone();

        deepLightCopyTest2.add("cc");
        System.out.println("deepLightCopyTest2:"+"["+deepLightCopyTest2.getArrayList()+"]");

        System.out.println("deepLightCopyTest:"+deepLightCopyTest);
        System.out.println("deepLightCopyTest2:"+deepLightCopyTest2);


        System.out.println("deepLightCopyTest:"+"[" + deepLightCopyTest.getArrayList() + "]");



    }


}
