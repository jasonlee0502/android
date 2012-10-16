package net.cyclestreets.planned;

import net.cyclestreets.R;
import net.cyclestreets.api.Waypoints;
import net.cyclestreets.content.RouteData;

import android.content.Context;

class CycleStreetsRoutingTask extends RoutingTask<Waypoints>
{
	/////////////////////////////////////////////////////
	private final String routeType_;
	private final int speed_;
			
	CycleStreetsRoutingTask(final String routeType,
				                  final int speed,
				                  final Context context) 
	{
	  super(R.string.finding_route, context);
		routeType_ = routeType;
		speed_ = speed;
	} // NewRouteTask
	
	@Override
	protected RouteData doInBackground(final Waypoints... waypoints)
	{
	  final Waypoints wp = waypoints[0];
		return fetchRoute(routeType_, speed_, wp);
	} // doInBackgroud
} // NewRouteTask
