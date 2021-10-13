package com.techyourchance.dagger2course.common.dependnecyinjection.presentation

import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListFragment
import dagger.Component
import javax.inject.Inject

@Component(modules = [PresentationModule::class])
interface PresentationComponent {
    fun inject(fragment: QuestionsListFragment)
    fun inject(activity: QuestionDetailsActivity)
}