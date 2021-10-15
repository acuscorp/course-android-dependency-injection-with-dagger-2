package com.techyourchance.dagger2course.common.dependnecyinjection.services

import android.app.Service
import android.content.Context
import android.view.LayoutInflater
import com.techyourchance.dagger2course.common.dependnecyinjection.activity.ActivityScope
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import dagger.Module
import dagger.Provides

@Module
class ServiceModule(private val service: Service) {

    @Provides
    fun context():Context = service
}