package com.example.myweatherforecast;

import android.widget.Toast;

import androidx.fragment.app.Fragment;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;


/*xutils加载网络数据的步骤
 * 1.整体模块声明
 *  2.执行网络请求操作
 * */
public class BaseFragment extends Fragment  implements Callback.CommonCallback<String>{
    public void loadData(String path){

        RequestParams params = new RequestParams(path);
        x.http().get(params,this);
        //Toast.makeText(getContext(),"执行网络请求操作成功",Toast.LENGTH_LONG).show();
    }
    //获取数据成功时，会回调的接口
    @Override
    public void onSuccess(String result) {

    }
    //获取数据失败时，会调用的接口
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }
    //取消请求时，会调用的接口
    @Override
    public void onCancelled(Callback.CancelledException cex) {

    }
    //请求完成后，会回调的接口
    @Override
    public void onFinished() {

    }
}
