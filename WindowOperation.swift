@available(OSX 10.15.7, *)
public func CGWindowListCopyWindowInfo(_ option: CGWinowListOption, _ relativeToWindow: CGWindowID) -> CFArray?

func getWindowList() -> [NSDictionary]? {
    guard let windowList: NSArray = CGWindowListCopyWindowInfo(.optionAll, kCGNullWindowID) else {
        return nil
    }

    let swiftWindowList = windowList as! [NSDictionary]

    return swiftWindowList
}

// ユーザーセッションにおける、オンスクリーン、オフスクリーン含む全てのウインドウのリスト。第2引数には `kCGNullWindowID` を指定しなければならない。
public static var optionAll: CGWindowListOption { get }

// ユーザーセッションにおける、全てのオンスクリーンウインドウのリスト。並び順はウインドウの順番である。第2引数には `kCGNullWindowID` を指定しなければならない。
public static var optionOnScreenOnly: CGWindowListOption { get }

// 第2引数に指定した Window ID より上にある全てのオンスクリーンウインドウのリスト。並び順はウインドウの順番である。
public static var optionOnScreenAboveWindow: CGWindowListOption { get }

// 第2引数に指定した Window ID より下にある全てのオンスクリーンウインドウのリスト。並び順はウインドウの順番である。
public static var optionOnScreenBelowWindow: CGWindowListOption { get }

// 第2引数に指定した Window ID のウインドウをリストに含める
public static var optionIncludingWindow: CGWindowListOption { get }

// デスクトップの要素をリストから除外する
public static var excludeDesktopElements: CGWindowListOption { get }