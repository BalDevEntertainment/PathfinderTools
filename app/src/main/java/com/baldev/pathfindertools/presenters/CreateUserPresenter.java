package com.baldev.pathfindertools.presenters;

import android.util.Log;

import com.baldev.pathfindertools.mvps.CreateUserMVP;
import com.baldev.pathfindertools.mvps.CreateUserMVP.Model;
import com.baldev.pathfindertools.mvps.CreateUserMVP.View;

import javax.inject.Inject;

public class CreateUserPresenter implements CreateUserMVP.Presenter {

	private final View view;
	private final Model model;

	@Inject
	public CreateUserPresenter(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void test() {
		Log.i("Dagger2", "It works!");
	}
}
