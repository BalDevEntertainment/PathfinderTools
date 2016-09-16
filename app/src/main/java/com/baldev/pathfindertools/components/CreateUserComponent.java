package com.baldev.pathfindertools.components;

import com.baldev.pathfindertools.modules.CreateUserModule;
import com.baldev.pathfindertools.views.CreateUserActivity;

import dagger.Component;

@Component(
		modules = CreateUserModule.class
)
public interface CreateUserComponent {
	void inject(CreateUserActivity activity);
}
