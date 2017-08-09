package com.dk.service;

import java.util.List;

import com.dk.object.MapWatchData;
import com.dk.object.Result;

public interface MapWatchDataService {
	Result addMapDateDef(MapWatchData data);
	Result addMapDateAct(MapWatchData data);
	
	List<MapWatchData> getInfos(MapWatchData data);

}
