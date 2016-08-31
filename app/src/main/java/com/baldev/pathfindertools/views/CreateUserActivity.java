package com.baldev.pathfindertools.views;

import android.app.Activity;
import android.os.Bundle;

import com.baldev.pathfindertools.R;
import com.baldev.pathfindertools.components.DaggerCreateUserComponent;
import com.baldev.pathfindertools.modules.CreateUserModule;
import com.baldev.pathfindertools.mvps.CreateUserMVP;
import com.baldev.pathfindertools.mvps.CreateUserMVP.Presenter;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class CreateUserActivity extends Activity implements CreateUserMVP.View {

	@Inject
	Presenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.blank_activity);
		ButterKnife.bind(this);
		setupComponent();
		presenter.test();
	}

	protected void setupComponent() {
		DaggerCreateUserComponent.builder()
				.createUserModule(new CreateUserModule(this))
				.build()
				.inject(this);
	}


}
