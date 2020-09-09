package com.example.malls.ui.home;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.malls.R;
import com.example.malls.base.BaseFragment;
import com.example.malls.interfaces.IBasePresenter;
import com.sunfusheng.marqueeview.MarqueeView;
import com.youth.banner.Banner;

import butterknife.BindView;

public class HomeFragment extends BaseFragment {


    @BindView(R.id.banner_home)
    Banner bannerHome;
    @BindView(R.id.img1)
    ImageView img1;
    @BindView(R.id.img2)
    ImageView img2;
    @BindView(R.id.img3)
    ImageView img3;
    @BindView(R.id.img4)
    ImageView img4;
    @BindView(R.id.ll_img)
    LinearLayout llImg;
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.tv3)
    TextView tv3;
    @BindView(R.id.tv4)
    TextView tv4;
    @BindView(R.id.ll_tv)
    LinearLayout llTv;
    @BindView(R.id.mv_home)
    MarqueeView mvHome;

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected IBasePresenter initpresenter() {
        return null;
    }

    @Override
    public void showTips(String tips) {

    }

    @Override
    public void showLoading(int visible) {

    }
}