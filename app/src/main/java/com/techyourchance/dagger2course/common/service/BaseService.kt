package com.techyourchance.dagger2course.common.service

import android.app.Service
import com.techyourchance.dagger2course.MyApplication
import com.techyourchance.dagger2course.common.dependnecyinjection.services.ServiceComponent
import com.techyourchance.dagger2course.common.dependnecyinjection.services.ServiceModule

abstract class BaseService: Service() {
    private val appComponent get() = (application as MyApplication).appComponent

    val serviceComponent: ServiceComponent by lazy {
        appComponent.newServiceComponent(ServiceModule(this))
    }
}