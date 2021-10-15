package com.techyourchance.dagger2course.common.dependnecyinjection.services

import com.techyourchance.dagger2course.common.dependnecyinjection.activity.ActivityScope
import com.techyourchance.dagger2course.common.dependnecyinjection.presentation.PresentationComponent
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ServiceModule::class])
interface ServiceComponent {

}