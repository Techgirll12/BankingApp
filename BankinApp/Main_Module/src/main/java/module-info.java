module Main.Module {
    requires Currency.Converter.module;
    requires LoggingModule;
    requires Access.Control.Module;
    requires Audit.Module;
    exports Main_Package;
}