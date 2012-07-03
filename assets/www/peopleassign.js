/**
 * PhoneGap is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 *
 * Copyright (c) Matt Kane 2010
 * Copyright (c) 2011, IBM Corporation
 */

PhoneGap.addConstructor(function() {
    PhoneGap.addPlugin('peopleAssign', new PeopleAssign());
});

var PeopleAssign = function() {
};


//-------------------------------------------------------------------
PeopleAssign.prototype.assign = function() {
    PhoneGap.exec(null, null, 'PeopleAssign', null, []);
};



