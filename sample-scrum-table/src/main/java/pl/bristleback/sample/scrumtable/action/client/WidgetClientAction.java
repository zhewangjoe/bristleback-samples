package pl.bristleback.sample.scrumtable.action.client;

import org.springframework.stereotype.Component;
import pl.bristleback.sample.scrumtable.vo.Widget;
import pl.bristleback.server.bristle.api.action.SendCondition;
import pl.bristleback.server.bristle.api.annotations.ClientAction;
import pl.bristleback.server.bristle.api.annotations.ClientActionClass;
import pl.bristleback.server.bristle.api.annotations.Ignore;
import pl.bristleback.server.bristle.api.users.IdentifiedUser;
import pl.bristleback.server.bristle.authorisation.conditions.AllUsersCondition;

import java.util.List;

@Component
@ClientActionClass
public class WidgetClientAction {


  @ClientAction
  public SendCondition newWidget(Widget newWidget) {
    return AllUsersCondition.getInstance();
  }

  @ClientAction
  public SendCondition resizeWidget(Widget widget) {
    return AllUsersCondition.getInstance();
  }

  @ClientAction
  public SendCondition moveWidget(Widget widget) {
    return AllUsersCondition.getInstance();
  }

  @ClientAction
  public IdentifiedUser widgetsList(List<Widget> allWidgets, @Ignore IdentifiedUser user) {
    return user;
  }
}
