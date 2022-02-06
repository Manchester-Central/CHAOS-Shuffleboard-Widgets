package com.chaos131.MyPlugin;

import java.util.List;

import com.google.common.collect.ImmutableList;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

@Description(group = "CHAOS 131", name = "CHAOSWidgets", summary = "A plugin containing widgets used by CHAOS, FRC Team 131", version = "1.0.0")
public class App extends Plugin {
	@Override
	@SuppressWarnings("all")
	public List<ComponentType> getComponents() {

		return ImmutableList.of(
			WidgetType.forAnnotatedWidget(AutoStepWidget.class)
		);
	}
}
