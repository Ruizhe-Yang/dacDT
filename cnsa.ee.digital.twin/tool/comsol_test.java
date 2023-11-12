/*
 * Untitled.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Nov 11 2023, 14:00 by COMSOL 6.1.0.252. */
public class Untitled {

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model.modelPath("C:\\Users\\94840\\Desktop");

    model.component().create("comp1", true);

    model.component("comp1").geom().create("geom1", 3);

    model.result().table().create("evl3", "Table");

    model.component("comp1").mesh().create("mesh1");

    model.component("comp1").geom("geom1").lengthUnit("cm");
    model.component("comp1").geom("geom1").create("wp1", "WorkPlane");
    model.component("comp1").geom("geom1").feature("wp1").set("unite", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("c1", "Circle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1").set("pos", new int[]{0, 0});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1")
         .set("layername", new String[]{"\u5c42 1", "\u5c42 2", "\u5c42 3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1")
         .set("layer", new double[]{0.5, 0.5, 0.5});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1").set("r", 5);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1").set("angle", 180);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("c2", "Circle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").set("pos", new double[]{0.25, 0});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").set("rot", 180);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2")
         .set("layername", new String[]{"\u5c42 1", "\u5c42 2", "\u5c42 3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2")
         .set("layer", new double[]{0.5, 0.5, 0.5});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").set("r", 4.75);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").set("angle", 180);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("uni1", "Union");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni1").selection("input").set("c1", "c2");
    model.component("comp1").geom("geom1").feature("wp1").geom().create("del1", "Delete");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("del1").selection("input").init(2);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("del1").selection("input")
         .set("uni1(1)", 6, 7, 8, 14);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pol1", "Polygon");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pol1").set("type", "open");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pol1").set("source", "table");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pol1")
         .set("table", new double[][]{{2.1431318985078683E-16, -3.9801020973877373E-16}, {3.9614525095095696, 0.5539801572518385}});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("par1", "Partition");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("par1").selection("input").set("del1");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("par1").selection("tool").set("pol1");
    model.component("comp1").geom("geom1").feature("wp1").geom().create("r1", "Rectangle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r1").set("pos", new int[]{-5, -10});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r1").set("size", new double[]{0.5, 10});
    model.component("comp1").geom("geom1").create("ext1", "Extrude");
    model.component("comp1").geom("geom1").feature("ext1").setIndex("distance", "0.5", 0);
    model.component("comp1").geom("geom1").feature("ext1").selection("input").set("wp1");
    model.component("comp1").geom("geom1").create("ext2", "Extrude");
    model.component("comp1").geom("geom1").feature("ext2").set("extrudefrom", "faces");
    model.component("comp1").geom("geom1").feature("ext2").set("distance", new double[]{0.5, 1});
    model.component("comp1").geom("geom1").feature("ext2").set("scale", new double[][]{{1, 1}, {1, 1}});
    model.component("comp1").geom("geom1").feature("ext2").set("displ", new double[][]{{0, 0}, {0, 0}});
    model.component("comp1").geom("geom1").feature("ext2").set("twist", new int[]{0, 0});
    model.component("comp1").geom("geom1").feature("ext2").selection("inputface").set("ext1(1)", 50);
    model.component("comp1").geom("geom1").create("ext3", "Extrude");
    model.component("comp1").geom("geom1").feature("ext3").set("extrudefrom", "faces");
    model.component("comp1").geom("geom1").feature("ext3").setIndex("distance", "10", 0);
    model.component("comp1").geom("geom1").feature("ext3").selection("inputface").set("ext2(1)", 58);
    model.component("comp1").geom("geom1").create("blk1", "Block");
    model.component("comp1").geom("geom1").feature("blk1").set("base", "center");
    model.component("comp1").geom("geom1").feature("blk1").set("size", new int[]{20, 20, 20});
    model.component("comp1").geom("geom1").create("cmd1", "CompositeDomains");
    model.component("comp1").geom("geom1").feature("cmd1").selection("input").set("fin(1)", 8, 13, 14, 15, 16);
    model.component("comp1").geom("geom1").run();

    model.component("comp1").selection().create("sel1", "Explicit");
    model.component("comp1").selection("sel1").set(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    model.component("comp1").selection().create("sel2", "Explicit");
    model.component("comp1").selection("sel2").geom("geom1", 2);
    model.component("comp1").selection("sel2").set(14, 16, 23, 24, 29, 30, 32, 36, 40, 49, 52, 58);
    model.component("comp1").selection("sel1").label("coil");
    model.component("comp1").selection("sel2").set("groupcontang", true);

    model.component("comp1").view("view1").hideObjects().create("hide1");

    model.component("comp1").material().create("mat1", "Common");
    model.component("comp1").material().create("mat2", "Common");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("eta", "Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("Cp", "Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("rho", "Analytic");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("k", "Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("cs", "Analytic");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("an1", "Analytic");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("an2", "Analytic");
    model.component("comp1").material("mat1").propertyGroup().create("RefractiveIndex", "Refractive index");
    model.component("comp1").material("mat1").propertyGroup().create("NonlinearModel", "Nonlinear model");
    model.component("comp1").material("mat1").propertyGroup().create("idealGas", "Ideal gas");
    model.component("comp1").material("mat1").propertyGroup("idealGas").func().create("Cp", "Piecewise");
    model.component("comp1").material("mat2").selection().set(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    model.component("comp1").material("mat2").propertyGroup().create("Enu", "Young's modulus and Poisson's ratio");
    model.component("comp1").material("mat2").propertyGroup().create("linzRes", "Linearized resistivity");

    model.component("comp1").physics().create("mf", "InductionCurrents", "geom1");
    model.component("comp1").physics("mf").create("coil1", "Coil", 3);
    model.component("comp1").physics("mf").feature("coil1").selection().named("sel1");
    model.component("comp1").physics("mf").feature("coil1").feature("ccc1").feature("ct1").selection().set(7);
    model.component("comp1").physics("mf").feature("coil1").feature("ccc1").create("cg1", "CoilGround", 2);
    model.component("comp1").physics("mf").feature("coil1").feature("ccc1").feature("cg1").selection().set(55);
    model.component("comp1").physics("mf").feature("coil1").feature("ccc1").create("ci1", "CoilInsulation", 2);
    model.component("comp1").physics("mf").feature("coil1").feature("ccc1").feature("ci1").selection().named("sel2");

    model.result().table("evl3").label("Evaluation 3D");
    model.result().table("evl3").comments("\u4ea4\u4e92\u7684\u4e09\u7ef4\u503c");

    model.component("comp1").view("view1").hideObjects("hide1").init(2);
    model.component("comp1").view("view1").hideObjects("hide1").set("cmd1(1)", 1, 4);
    model.component("comp1").view("view2").axis().set("xmin", -17.143829345703125);
    model.component("comp1").view("view2").axis().set("xmax", 16.125274658203125);
    model.component("comp1").view("view2").axis().set("ymin", -13.4514799118042);
    model.component("comp1").view("view2").axis().set("ymax", 7.827236175537109);

    model.component("comp1").material("mat1").label("Air");
    model.component("comp1").material("mat1").set("family", "air");
    model.component("comp1").material("mat1").propertyGroup("def").label("Basic");
    model.component("comp1").material("mat1").propertyGroup("def").func("eta").label("Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func("eta").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("def").func("eta")
         .set("pieces", new String[][]{{"200.0", "1600.0", "-8.38278E-7+8.35717342E-8*T^1-7.69429583E-11*T^2+4.6437266E-14*T^3-1.06585607E-17*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("eta").set("argunit", "K");
    model.component("comp1").material("mat1").propertyGroup("def").func("eta").set("fununit", "Pa*s");
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp").label("Piecewise 2");
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp")
         .set("pieces", new String[][]{{"200.0", "1600.0", "1047.63657-0.372589265*T^1+9.45304214E-4*T^2-6.02409443E-7*T^3+1.2858961E-10*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp").set("argunit", "K");
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp").set("fununit", "J/(kg*K)");
    model.component("comp1").material("mat1").propertyGroup("def").func("rho").label("Analytic");
    model.component("comp1").material("mat1").propertyGroup("def").func("rho")
         .set("expr", "pA*0.02897/R_const[K*mol/J]/T");
    model.component("comp1").material("mat1").propertyGroup("def").func("rho").set("args", new String[]{"pA", "T"});
    model.component("comp1").material("mat1").propertyGroup("def").func("rho").set("fununit", "kg/m^3");
    model.component("comp1").material("mat1").propertyGroup("def").func("rho")
         .set("argunit", new String[]{"Pa", "K"});
    model.component("comp1").material("mat1").propertyGroup("def").func("rho")
         .set("plotargs", new String[][]{{"pA", "101325", "101325"}, {"T", "273.15", "293.15"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("k").label("Piecewise 3");
    model.component("comp1").material("mat1").propertyGroup("def").func("k").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("def").func("k")
         .set("pieces", new String[][]{{"200.0", "1600.0", "-0.00227583562+1.15480022E-4*T^1-7.90252856E-8*T^2+4.11702505E-11*T^3-7.43864331E-15*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("k").set("argunit", "K");
    model.component("comp1").material("mat1").propertyGroup("def").func("k").set("fununit", "W/(m*K)");
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").label("Analytic 2");
    model.component("comp1").material("mat1").propertyGroup("def").func("cs")
         .set("expr", "sqrt(1.4*R_const[K*mol/J]/0.02897*T)");
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").set("args", new String[]{"T"});
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").set("fununit", "m/s");
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").set("argunit", new String[]{"K"});
    model.component("comp1").material("mat1").propertyGroup("def").func("cs")
         .set("plotargs", new String[][]{{"T", "273.15", "373.15"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("an1").label("Analytic 1");
    model.component("comp1").material("mat1").propertyGroup("def").func("an1").set("funcname", "alpha_p");
    model.component("comp1").material("mat1").propertyGroup("def").func("an1")
         .set("expr", "-1/rho(pA,T)*d(rho(pA,T),T)");
    model.component("comp1").material("mat1").propertyGroup("def").func("an1").set("args", new String[]{"pA", "T"});
    model.component("comp1").material("mat1").propertyGroup("def").func("an1").set("fununit", "1/K");
    model.component("comp1").material("mat1").propertyGroup("def").func("an1")
         .set("argunit", new String[]{"Pa", "K"});
    model.component("comp1").material("mat1").propertyGroup("def").func("an1")
         .set("plotargs", new String[][]{{"pA", "101325", "101325"}, {"T", "273.15", "373.15"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("an2").label("Analytic 2a");
    model.component("comp1").material("mat1").propertyGroup("def").func("an2").set("funcname", "muB");
    model.component("comp1").material("mat1").propertyGroup("def").func("an2").set("expr", "0.6*eta(T)");
    model.component("comp1").material("mat1").propertyGroup("def").func("an2").set("args", new String[]{"T"});
    model.component("comp1").material("mat1").propertyGroup("def").func("an2").set("fununit", "Pa*s");
    model.component("comp1").material("mat1").propertyGroup("def").func("an2").set("argunit", new String[]{"K"});
    model.component("comp1").material("mat1").propertyGroup("def").func("an2")
         .set("plotargs", new String[][]{{"T", "200", "1600"}});
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("thermalexpansioncoefficient", new String[]{"alpha_p(pA,T)", "0", "0", "0", "alpha_p(pA,T)", "0", "0", "0", "alpha_p(pA,T)"});
    model.component("comp1").material("mat1").propertyGroup("def").set("molarmass", "0.02897[kg/mol]");
    model.component("comp1").material("mat1").propertyGroup("def").set("bulkviscosity", "muB(T)");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("relpermeability", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("relpermittivity", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("def").set("dynamicviscosity", "eta(T)");
    model.component("comp1").material("mat1").propertyGroup("def").set("ratioofspecificheat", "1.4");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("electricconductivity", new String[]{"0[S/m]", "0", "0", "0", "0[S/m]", "0", "0", "0", "0[S/m]"});
    model.component("comp1").material("mat1").propertyGroup("def").set("heatcapacity", "Cp(T)");
    model.component("comp1").material("mat1").propertyGroup("def").set("density", "rho(pA,T)");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("thermalconductivity", new String[]{"k(T)", "0", "0", "0", "k(T)", "0", "0", "0", "k(T)"});
    model.component("comp1").material("mat1").propertyGroup("def").set("soundspeed", "cs(T)");
    model.component("comp1").material("mat1").propertyGroup("def").addInput("temperature");
    model.component("comp1").material("mat1").propertyGroup("def").addInput("pressure");
    model.component("comp1").material("mat1").propertyGroup("RefractiveIndex").label("Refractive index");
    model.component("comp1").material("mat1").propertyGroup("RefractiveIndex")
         .set("n", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("NonlinearModel").label("Nonlinear model");
    model.component("comp1").material("mat1").propertyGroup("NonlinearModel").set("BA", "(def.gamma+1)/2");
    model.component("comp1").material("mat1").propertyGroup("idealGas").label("Ideal gas");
    model.component("comp1").material("mat1").propertyGroup("idealGas").func("Cp").label("Piecewise 2");
    model.component("comp1").material("mat1").propertyGroup("idealGas").func("Cp").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("idealGas").func("Cp")
         .set("pieces", new String[][]{{"200.0", "1600.0", "1047.63657-0.372589265*T^1+9.45304214E-4*T^2-6.02409443E-7*T^3+1.2858961E-10*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("idealGas").func("Cp").set("argunit", "K");
    model.component("comp1").material("mat1").propertyGroup("idealGas").func("Cp").set("fununit", "J/(kg*K)");
    model.component("comp1").material("mat1").propertyGroup("idealGas").set("Rs", "R_const/Mn");
    model.component("comp1").material("mat1").propertyGroup("idealGas").set("heatcapacity", "Cp(T)");
    model.component("comp1").material("mat1").propertyGroup("idealGas").set("ratioofspecificheat", "1.4");
    model.component("comp1").material("mat1").propertyGroup("idealGas").set("molarmass", "0.02897");
    model.component("comp1").material("mat1").propertyGroup("idealGas").addInput("temperature");
    model.component("comp1").material("mat1").propertyGroup("idealGas").addInput("pressure");
    model.component("comp1").material("mat1").materialType("nonSolid");
    model.component("comp1").material("mat2").label("Copper");
    model.component("comp1").material("mat2").set("family", "copper");
    model.component("comp1").material("mat2").propertyGroup("def").label("Basic");
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("relpermeability", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("electricconductivity", new String[]{"5.998e7[S/m]", "0", "0", "0", "5.998e7[S/m]", "0", "0", "0", "5.998e7[S/m]"});
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("thermalexpansioncoefficient", new String[]{"17e-6[1/K]", "0", "0", "0", "17e-6[1/K]", "0", "0", "0", "17e-6[1/K]"});
    model.component("comp1").material("mat2").propertyGroup("def").set("heatcapacity", "385[J/(kg*K)]");
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("relpermittivity", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat2").propertyGroup("def").set("density", "8960[kg/m^3]");
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("thermalconductivity", new String[]{"400[W/(m*K)]", "0", "0", "0", "400[W/(m*K)]", "0", "0", "0", "400[W/(m*K)]"});
    model.component("comp1").material("mat2").propertyGroup("Enu").label("Young's modulus and Poisson's ratio");
    model.component("comp1").material("mat2").propertyGroup("Enu").set("E", "110[GPa]");
    model.component("comp1").material("mat2").propertyGroup("Enu").set("nu", "0.35");
    model.component("comp1").material("mat2").propertyGroup("linzRes").label("Linearized resistivity");
    model.component("comp1").material("mat2").propertyGroup("linzRes").set("rho0", "1.72e-8[ohm*m]");
    model.component("comp1").material("mat2").propertyGroup("linzRes").set("alpha", "0.0039[1/K]");
    model.component("comp1").material("mat2").propertyGroup("linzRes").set("Tref", "298[K]");
    model.component("comp1").material("mat2").propertyGroup("linzRes").addInput("temperature");

    model.study().create("std1");
    model.study("std1").create("ccc", "CoilCurrentCalculation");
    model.study("std1").create("stat", "Stationary");

    model.sol().create("sol1");
    model.sol("sol1").study("std1");
    model.sol("sol1").attach("std1");
    model.sol("sol1").create("st1", "StudyStep");
    model.sol("sol1").create("v1", "Variables");
    model.sol("sol1").create("s1", "Stationary");
    model.sol("sol1").create("su1", "StoreSolution");
    model.sol("sol1").create("st2", "StudyStep");
    model.sol("sol1").create("v2", "Variables");
    model.sol("sol1").create("s2", "Stationary");
    model.sol("sol1").feature("s1").create("fc1", "FullyCoupled");
    model.sol("sol1").feature("s1").feature().remove("fcDef");
    model.sol("sol1").feature("s2").create("se1", "Segregated");
    model.sol("sol1").feature("s2").create("i1", "Iterative");
    model.sol("sol1").feature("s2").create("d1", "Direct");
    model.sol("sol1").feature("s2").feature("se1").create("ss1", "SegregatedStep");
    model.sol("sol1").feature("s2").feature("se1").create("ss2", "SegregatedStep");
    model.sol("sol1").feature("s2").feature("se1").feature().remove("ssDef");
    model.sol("sol1").feature("s2").feature("i1").create("mg1", "Multigrid");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("pr").create("so1", "SOR");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("po").create("so1", "SOR");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("cs").create("ams1", "AMS");
    model.sol("sol1").feature("s2").feature().remove("fcDef");

    model.result().create("pg1", "PlotGroup3D");
    model.result().create("pg2", "PlotGroup3D");
    model.result("pg1").create("mslc1", "Multislice");
    model.result("pg2").create("vol1", "Volume");
    model.result("pg2").create("arws1", "ArrowSurface");
    model.result("pg2").feature("vol1").set("expr", "mf.normJ");
    model.result("pg2").feature("vol1").create("sel1", "Selection");
    model.result("pg2").feature("vol1").feature("sel1").selection().named("sel1");
    model.result("pg2").feature("arws1").create("sel1", "Selection");
    model.result("pg2").feature("arws1").feature("sel1").selection()
         .set(9, 13, 20, 21, 27, 28, 34, 38, 42, 47, 51, 56, 57);

    model.sol("sol1").attach("std1");
    model.sol("sol1").feature("st1").label("\u7f16\u8bd1\u65b9\u7a0b: \u7ebf\u5708\u51e0\u4f55\u5206\u6790");
    model.sol("sol1").feature("v1").label("\u56e0\u53d8\u91cf 1.1");
    model.sol("sol1").feature("s1").label("\u7a33\u6001\u6c42\u89e3\u5668 1.1");
    model.sol("sol1").feature("s1").set("probesel", "none");
    model.sol("sol1").feature("s1").feature("dDef").label("\u76f4\u63a5 1");
    model.sol("sol1").feature("s1").feature("aDef").label("\u9ad8\u7ea7 1");
    model.sol("sol1").feature("s1").feature("fc1").label("\u5168\u8026\u5408 1.1");
    model.sol("sol1").feature("su1").label("\u89e3\u5b58\u50a8 1.1");
    model.sol("sol1").feature("st2").label("\u7f16\u8bd1\u65b9\u7a0b: \u7a33\u6001");
    model.sol("sol1").feature("st2").set("studystep", "stat");
    model.sol("sol1").feature("v2").label("\u56e0\u53d8\u91cf 2.1");
    model.sol("sol1").feature("v2").set("initmethod", "sol");
    model.sol("sol1").feature("v2").set("initsol", "sol1");
    model.sol("sol1").feature("v2").set("solnum", "auto");
    model.sol("sol1").feature("v2").set("notsolmethod", "sol");
    model.sol("sol1").feature("v2").set("notsol", "sol1");
    model.sol("sol1").feature("v2").set("notsolnum", "auto");
    model.sol("sol1").feature("s2").label("\u7a33\u6001\u6c42\u89e3\u5668 2.1");
    model.sol("sol1").feature("s2").feature("dDef").label("\u76f4\u63a5 2");
    model.sol("sol1").feature("s2").feature("aDef").label("\u9ad8\u7ea7 1");
    model.sol("sol1").feature("s2").feature("se1").label("\u5206\u79bb 1.1");
    model.sol("sol1").feature("s2").feature("se1").feature("ss1").label("\u78c1\u573a");
    model.sol("sol1").feature("s2").feature("se1").feature("ss1").set("segvar", new String[]{"comp1_A"});
    model.sol("sol1").feature("s2").feature("se1").feature("ss1").set("linsolver", "i1");
    model.sol("sol1").feature("s2").feature("se1").feature("ss2")
         .label("\u7ebf\u5708\u5e38\u5fae\u5206\u65b9\u7a0b\u53d8\u91cf");
    model.sol("sol1").feature("s2").feature("se1").feature("ss2")
         .set("segvar", new String[]{"comp1_mf_coil1_VCoil_ode"});
    model.sol("sol1").feature("s2").feature("se1").feature("ss2").set("linsolver", "d1");
    model.sol("sol1").feature("s2").feature("i1").label("\u8fed\u4ee3 1.1");
    model.sol("sol1").feature("s2").feature("i1").set("linsolver", "fgmres");
    model.sol("sol1").feature("s2").feature("i1").set("nlinnormuse", true);
    model.sol("sol1").feature("s2").feature("i1").set("rhob", 10000);
    model.sol("sol1").feature("s2").feature("i1").feature("ilDef").label("\u4e0d\u5b8c\u5168 LU \u5206\u89e3 1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").label("\u591a\u91cd\u7f51\u683c 1.1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("pr").label("\u9884\u5e73\u6ed1\u5668 1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("pr").feature("soDef").label("SOR 2");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("pr").feature("so1").label("SOR 1.1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("po").label("\u540e\u5e73\u6ed1\u5668 1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("po").feature("soDef").label("SOR 2");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("po").feature("so1").label("SOR 1.1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("cs")
         .label("\u7c97\u5316\u6c42\u89e3\u5668 1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("cs").feature("dDef")
         .label("\u76f4\u63a5 1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("cs").feature("ams1")
         .label("\u8f85\u52a9\u7a7a\u95f4\u9ea6\u514b\u65af\u97e6\u6c42\u89e3\u5668 (AMS) 1.1");
    model.sol("sol1").feature("s2").feature("i1").feature("mg1").feature("cs").feature("ams1")
         .set("sorvecdof", new String[]{"comp1_A"});
    model.sol("sol1").feature("s2").feature("d1").label("\u76f4\u63a5 1.1");
    model.sol("sol1").runAll();

    model.result("pg1").label("\u78c1\u901a\u5bc6\u5ea6\u6a21 (mf)");
    model.result("pg1").set("frametype", "spatial");
    model.result("pg1").set("showlegendsmaxmin", true);
    model.result("pg1").feature("mslc1").set("multiplanexmethod", "coord");
    model.result("pg1").feature("mslc1").set("xcoord", "mf.CPx");
    model.result("pg1").feature("mslc1").set("multiplaneymethod", "coord");
    model.result("pg1").feature("mslc1").set("ycoord", "mf.CPy");
    model.result("pg1").feature("mslc1").set("multiplanezmethod", "coord");
    model.result("pg1").feature("mslc1").set("zcoord", "mf.CPz");
    model.result("pg1").feature("mslc1").set("colortable", "Prism");
    model.result("pg1").feature("mslc1").set("colortabletrans", "nonlinear");
    model.result("pg1").feature("mslc1").set("colorcalibration", -0.8);
    model.result("pg1").feature("mslc1").set("resolution", "normal");
    model.result("pg2").feature("vol1").set("resolution", "normal");
    model.result("pg2").feature("arws1").set("expr", new String[]{"mf.Jx", "mf.Jy", "mf.Jz"});
    model.result("pg2").feature("arws1").set("descr", "\u7535\u6d41\u5bc6\u5ea6");
    model.result("pg2").feature("arws1").set("arrowcount", 500);
    model.result("pg2").feature("arws1").set("arrowlength", "logarithmic");
    model.result("pg2").feature("arws1").set("scale", 1.8290108835001445E-5);
    model.result("pg2").feature("arws1").set("scaleactive", false);

    return model;
  }

  public static void main(String[] args) {
    run();
  }

}
