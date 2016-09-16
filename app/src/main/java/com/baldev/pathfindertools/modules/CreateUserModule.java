package com.baldev.pathfindertools.modules;

import com.baldev.pathfindertools.model.CreateUserModel;
import com.baldev.pathfindertools.mvps.CreateUserMVP.Model;
import com.baldev.pathfindertools.mvps.CreateUserMVP.Presenter;
import com.baldev.pathfindertools.mvps.CreateUserMVP.View;
import com.baldev.pathfindertools.presenters.CreateUserPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class CreateUserModule {
	private View view;

	public CreateUserModule(View view) {
		this.view = view;
	}

	@Provides
	public View provideView() {
		return view;
	}

	@Provides
	public Model provideModel() {
		return new CreateUserModel();
	}

	@Provides
	public Presenter providePresenter(View view, Model model) {
		return new CreateUserPresenter(view, model);
	}

}
