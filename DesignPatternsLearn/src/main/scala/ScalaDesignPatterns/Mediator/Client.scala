package ScalaDesignPatterns.Mediator

import ScalaDesignPatterns.Mediator.Colleague.{Form, Fram, LogPanel}
import ScalaDesignPatterns.Mediator.Mediator.EventMediator

/**
  * Created by hjw on 17/10/4.
  */
object Client extends App{
  val mediator = EventMediator.instance
  mediator.colleagues.append(LogPanel.log)
  mediator.colleagues.append(Fram.handleEvent)
  mediator.colleagues.append(Form.receive)
  Fram.input
  Form.update
  Form.save

  //Logger: MouseEvent(ScalaDesignPatterns.Mediator.Colleague.Fram$@38082d64,10,10,Clicked)
  //Do nothing event from self
  //Form Receive event: MouseEvent(ScalaDesignPatterns.Mediator.Colleague.Fram$@38082d64,10,10,Clicked)
  //Input changed
  //  Logger: ActionEvent(ScalaDesignPatterns.Mediator.Colleague.Form$@1324409e,Updated doc)
  //Frame Requires save
  //Form Receive event: ActionEvent(ScalaDesignPatterns.Mediator.Colleague.Form$@1324409e,Updated doc)
  //Logger: SaveEvent(ScalaDesignPatterns.Mediator.Colleague.Form$@1324409e,Saved)
  //Frame Save reset
  //Form Receive event: SaveEvent(ScalaDesignPatterns.Mediator.Colleague.Form$@1324409e,Saved)
}
