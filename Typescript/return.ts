function isBigEnough ( element , index , array ) {
    return ( element >= 30 );
    }
    var passed = [ 12 , 5 , 8 , 130 , 44 ]. filter ( isBigEnough );
    console . log ( "Test Value : " + passed );