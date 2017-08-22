package thelm.wrapup.event;

import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IContextSetter;

public class RecipeRegistryWrapUpEvent extends Event implements IContextSetter {

	public int id = -1;

	public static class Event0 extends RecipeRegistryWrapUpEvent {
		public Event0() {
			id = 0;
		}
	}

	public static class Event1 extends RecipeRegistryWrapUpEvent {
		public Event1() {
			id = 1;
		}
	}

	public static class Event2 extends RecipeRegistryWrapUpEvent {
		public Event2() {
			id = 2;
		}
	}

	public static class Event3 extends RecipeRegistryWrapUpEvent {
		public Event3() {
			id = 3;
		}
	}

	public static class Event4 extends RecipeRegistryWrapUpEvent {
		public Event4() {
			id = 4;
		}
	}
}
