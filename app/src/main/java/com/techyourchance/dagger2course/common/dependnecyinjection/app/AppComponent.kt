package com.techyourchance.dagger2course.common.dependnecyinjection.app

import android.app.Service
import com.techyourchance.dagger2course.common.dependnecyinjection.activity.ActivityComponent
import com.techyourchance.dagger2course.common.dependnecyinjection.activity.ActivityModule
import com.techyourchance.dagger2course.common.dependnecyinjection.services.ServiceComponent
import com.techyourchance.dagger2course.common.dependnecyinjection.services.ServiceModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun newActivityComponentBuilder/*newActivityComponent*/(/*activityModule: ActivityModule*/):ActivityComponent.Builder
    fun newServiceComponent(service: ServiceModule): ServiceComponent

}