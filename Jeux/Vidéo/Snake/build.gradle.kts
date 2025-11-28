/* #################################################################################### */
/*                                                                                      */
/*  SPDX-License-Identifier: UNLICENSED                                                 */
/*  See LICENSE.txt for full license terms (FR/EN).                                     */
/*                                                                                      */
/* #################################################################################### */

group           = ""
version         = ""

/* #################################################################################### */

val targetDir   = ""
val program     = ""

/* #################################################################################### */

plugins {

}

repositories {

}

application {

}

java {
    toolchain {

    }
}

javafx {

}

jlink {


    launcher {

    }

    jpackage {

    }
}

/* #################################################################################### */

tasks.named<Delete>("clean") {

}

tasks.named<Jar>("jar") {


    manifest {

    }
}

tasks.register<Zip>("packageZip") {


    from("${targetDir}/${rootProject.name}") {

    }

    doLast {

    }
}

/* #################################################################################### */
