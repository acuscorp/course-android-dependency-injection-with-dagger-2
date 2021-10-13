Module - declare the implementations
Component - is the interface for module
Scope - is where is ogoing to be used


Application Scope           AppCommpositionRoot

                                    ^
-----------------------------------------------------------------------------------------
                                    |
Activity Scope              ActivityComponent
                                    ^
-----------------------------------------------------------------------------------------
                                    |
Presentation Scope          PresentationComponent
                                    ^
-----------------------------------------------------------------------------------------
                                    |
or                               Injector
                                    ^
-----------------------------------------------------------------------------------------
                                    |
Controller Scope            Activities and fragments