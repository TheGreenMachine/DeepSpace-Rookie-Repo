package com.edinarobotics.utils.gamepad.gamepadfilters;

import com.edinarobotics.utils.gamepad.GamepadAxisState;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class applies multiple other GamepadFilters to a Gamepad.
 */
public class GamepadFilterSet implements GamepadFilter {
    private List<GamepadFilter> filters;
    
    /**
     * Constructs a new GamepadFilterSet that applies the given filters to the
     * gamepad in the order in which they are positioned in the array.
     * @param filters The array of filters to be applied to the gamepad.
     */
    public GamepadFilterSet(List<GamepadFilter> filters) {
        this.filters = filters;
    }

    /**
     * Constructs a new empty GamepadFilterSet with no filters added to the set
     */
    public GamepadFilterSet() {
        this.filters = new ArrayList<>();
    }

    /**
     * Appends a new <code>GamepadFilter</code> to the list of filters that
     * will be applied to the gamepad.
     * @param filter The {@link GamepadFilter} to be added to the list of filters.
     * @return <code>true</code> (as specified by {@link List#add})
     */
    public boolean add(GamepadFilter filter) {
        return filters.add(filter);
    }

    /**
     * Appends many <code>GamepadFilter</code>s to the list of filters that
     * will be applied to the gamepad.
     * @param filter A {@link Collection} of {@link GamepadFilter}s to be added to the list of filters.
     * @return <code>true</code> (as specified by {@link List#add})
     */
    public boolean addAll(Collection<GamepadFilter> filter) {
        return filters.addAll(filter);
    }
    
    /**
     * Filters the given GamepadAxisState object through the given set of
     * filters. The filters are applied in order.
     * @param toFilter The GamepadAxisState object to be filtered.
     * @return A new GamepadAxisState object representing the result of
     * filtering the input GamepadAxisState object.
     */
    public GamepadAxisState filter(GamepadAxisState toFilter){
        GamepadAxisState current = toFilter;
        
    	for (GamepadFilter filter : filters){
    		current = filter.filter(current);
    	}
    	
        return current;
        
    }
}
