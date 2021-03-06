package io.github.mayubao.kuaichuan.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;

/**
 * 测试Behavior的类
 *
 * Created by mayubao on 2016/12/6.
 * Contact me 345269374@qq.com
 */
public class MyFloatingButtonBehavior extends CoordinatorLayout.Behavior<AppCompatButton> {

    public MyFloatingButtonBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, AppCompatButton child, View dependency) {
//        return super.onDependentViewChanged(parent, child, dependency);
        if (dependency instanceof AppBarLayout) {

        }
        return false;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, AppCompatButton child, View dependency) {
//        return super.layoutDependsOn(parent, child, dependency);
        return dependency instanceof AppBarLayout;
    }
}
