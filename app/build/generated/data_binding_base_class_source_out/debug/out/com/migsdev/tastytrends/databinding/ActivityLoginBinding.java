// Generated by view binder compiler. Do not edit!
package com.migsdev.tastytrends.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.migsdev.tastytrends.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnreturn;

  @NonNull
  public final AppCompatButton btnsignin;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final EditText loginEmail;

  @NonNull
  public final EditText loginPassword;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvforgotbtn;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnreturn,
      @NonNull AppCompatButton btnsignin, @NonNull ImageView imageView2,
      @NonNull EditText loginEmail, @NonNull EditText loginPassword, @NonNull LinearLayout main,
      @NonNull TextView textView, @NonNull TextView tvforgotbtn) {
    this.rootView = rootView;
    this.btnreturn = btnreturn;
    this.btnsignin = btnsignin;
    this.imageView2 = imageView2;
    this.loginEmail = loginEmail;
    this.loginPassword = loginPassword;
    this.main = main;
    this.textView = textView;
    this.tvforgotbtn = tvforgotbtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnreturn;
      AppCompatButton btnreturn = ViewBindings.findChildViewById(rootView, id);
      if (btnreturn == null) {
        break missingId;
      }

      id = R.id.btnsignin;
      AppCompatButton btnsignin = ViewBindings.findChildViewById(rootView, id);
      if (btnsignin == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.login_email;
      EditText loginEmail = ViewBindings.findChildViewById(rootView, id);
      if (loginEmail == null) {
        break missingId;
      }

      id = R.id.login_password;
      EditText loginPassword = ViewBindings.findChildViewById(rootView, id);
      if (loginPassword == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvforgotbtn;
      TextView tvforgotbtn = ViewBindings.findChildViewById(rootView, id);
      if (tvforgotbtn == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, btnreturn, btnsignin, imageView2,
          loginEmail, loginPassword, main, textView, tvforgotbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
