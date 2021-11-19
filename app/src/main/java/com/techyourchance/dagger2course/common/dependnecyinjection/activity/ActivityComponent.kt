package com.techyourchance.dagger2course.common.dependnecyinjection.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import com.techyourchance.dagger2course.common.dependnecyinjection.presentation.PresentationComponent
import com.techyourchance.dagger2course.common.dependnecyinjection.presentation.PresentationModule
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun newPresentationComponent():PresentationComponent

    @Subcomponent.Builder
    interface Builder {  /*Builder pattern*/

        /*
        * As dagger don't know if this is a module or an instance we need to
        * add @BindInstance to get "individual dependencies"
        * */
        @BindsInstance fun activity(activity: AppCompatActivity): Builder
        fun activityModule(activityModule: ActivityModule):Builder  /*We require activity module to pass */
        fun build(): ActivityComponent
    }
}