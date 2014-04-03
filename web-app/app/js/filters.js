'use strict';

/* Filters */

angular.module('curriculumApp.filters', []).
  filter('interpolate', ['version', function(version) {
    return function(text) {
      return String(text).replace(/\%VERSION\%/mg, version);
    }
  }]).filter('unique', ['$parse', function ($parse) {

  return function (items, filterOn) {

    if (filterOn === false) {
      return items;
    }

    if ((filterOn || angular.isUndefined(filterOn)) && angular.isArray(items)) {
      var newItems = [],
        get = angular.isString(filterOn) ? $parse(filterOn) : function (item) { return item; };

      var extractValueToCompare = function (item) {
        return angular.isObject(item) ? get(item) : item;
      };

      angular.forEach(items, function (item) {
        var isDuplicate = false;

        for (var i = 0; i < newItems.length; i++) {
          if (angular.equals(extractValueToCompare(newItems[i]), extractValueToCompare(item))) {
            isDuplicate = true;
            break;
          }
        }
        if (!isDuplicate) {
          newItems.push(item);
        }

      });
      items = newItems;
    }
    return items;
  };
}]).filter('GenEdFilter', [function(){
	  /* array is first argument, each additional argument is prefixed by a ":" in filter markup*/
	  return function(dataArray, searchTerm){
	      if(!dataArray ) return;
	      /* when term is cleared, return full array*/
	      if( !searchTerm){
	          return dataArray
	       }else{
	           /* otherwise filter the array */
	           return dataArray.filter(function( item){
                  if(item.genEd){
                	 if(item.genEdAlt)
                		 {
                		 return item.genEd.indexOf(searchTerm) > -1 || item.genEdAlt.indexOf(searchTerm) > -1;  
                		 }
                	 else
                	 {
                		 return item.genEd.indexOf(searchTerm) > -1;
                	 }
                  }
	           });
	       } 
	  }    
	}]);
